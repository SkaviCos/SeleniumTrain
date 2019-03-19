package ru.stqa.pft.addressbook.tests;

import org.junit.Before;
import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class GroupModificationTest extends TestBase {
    @Before
    public void ensurePreconditions() {//выполнение предусловия
        app.goTo().groupPage();
        if (app.group().all().size() == 0) {//если элемента в данном месте нет то создать такой элемент
            app.group().create(new GroupData().withName("test1"));//и продолжить выполнение метода,если он существует то пропустить шаг
        }
    }

    @Test
    public void testGroupModification() {
        Groups before = app.group().all();
        GroupData modifiedGroup = before.iterator().next();
        GroupData group = new GroupData().withId(modifiedGroup.getId()).withName("test1").withFooter("test1").withHeader("test1");
        app.group().modify(group);
        Groups after = app.group().all();
        assertEquals(after.size(), before.size());
        assertThat(after, equalTo(before.without(modifiedGroup).withAdded(group)));


    }

}
