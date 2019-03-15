package ru.stqa.pft.addressbook.tests;

import org.junit.Before;
import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GroupModificationTest extends TestBase {
    @Before
    public void ensurePreconditions() {//выполнение предусловия
        app.goTo().groupPage();
        if (app.group().list().size() == 0) {//если элемента в данном месте нет то создать такой элемент
            app.group().create(new GroupData().withName("test1"));//и продолжить выполнение метода,если он существует то пропустить шаг
        }
    }

    @Test
    public void testGroupModification() {
        Set<GroupData> before = app.group().all();
        GroupData modifiedGroup = before.iterator().next();
        GroupData group = new GroupData().withId(modifiedGroup.getId()).withName("test2").withHeader("test2").withFooter("test2");
        app.group().modify(group);
        Set<GroupData> after = app.group().all();
        assertEquals(after.size(), before.size());

        before.remove(modifiedGroup);//удаляем элемент
        before.add(group);
        assertEquals(before, after);//проверка в которой происходит преобразование в из списка в множество
    }

}
