package ru.stqa.pft.addressbook.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GroupDeleteTest extends TestBase {
    @Before
    public void ensurePreconditions() {//выполнение предусловия
        app.goTo().groupPage();
        if (app.group().list().size() == 0) {//если элемента в данном месте нет то создать такой элемент
            app.group().create(new GroupData().withName("test1"));//и продолжить выполнение метода,если он существует то пропустить шаг
        }
    }

    @Test
    public void GroupDeleteTest() {
        List<GroupData> before = app.group().all();
//        int index = before.size() - 1;
        GroupData deletedGroup = before.iterator().next();
        app.group().delete(deletedGroup);
        List<GroupData> after = app.group().all();
        assertEquals(after.size(), before.size() - 1);// сравнение размера

        before.remove(deletedGroup);
        assertEquals(after, before);// сравнение самих списков


    }


}

