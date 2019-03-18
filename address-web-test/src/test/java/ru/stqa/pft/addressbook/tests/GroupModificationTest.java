package ru.stqa.pft.addressbook.tests;

import org.junit.Before;
import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GroupModificationTest extends TestBase {
    @Before
    public void ensurePreconditions() {//выполнение предусловия
        app.goTo().groupPage();
        if (app.group().list().size() == 0) {//если элемента в данном месте нет то создать такой элемент
            app.group().create(new GroupData("test1",null, null));//и продолжить выполнение метода,если он существует то пропустить шаг
        }
    }

    @Test
    public void testGroupModification() {
        List<GroupData> before = app.group().all();
        int index = before.size()-1;
        GroupData modifiedGroup = before.iterator().next();
        GroupData group = new GroupData( "test1", "test1", "test1", before.get(index).getId());
        app.group().modify(group);
        List<GroupData> after = app.group().all();
        assertEquals(after.size(), before.size());

        before.remove(modifiedGroup);//удаляем элемент
        before.add(group);

        assertEquals(before, after);//проверка в которой происходит преобразование в из списка в множество
    }

}
