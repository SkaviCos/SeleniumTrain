package ru.stqa.pft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.junit.Assert.assertEquals;

public class GroupDeleteTest extends TestBase {
    @Before
    public void ensurePreconditions() {//выполнение предусловия
        app.goTo().groupPage();
        if (app.group().all().size() == 0) {//если элемента в данном месте нет то создать такой элемент
            app.group().create(new GroupData().withName("test1"));//и продолжить выполнение метода,если он существует то пропустить шаг
        }
    }

    @Test
    public void GroupDeleteTest() {
        Groups before = app.group().all();
        GroupData deletedGroup = before.iterator().next();
        app.group().delete(deletedGroup);
        Groups after = app.group().all();
        assertEquals(after.size(), before.size() - 1);// сравнение размера
        MatcherAssert.assertThat(after, CoreMatchers.equalTo(before.without(deletedGroup)));


    }


}

