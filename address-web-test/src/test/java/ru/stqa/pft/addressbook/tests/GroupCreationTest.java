package ru.stqa.pft.addressbook.tests;

import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        //for(int i =0;i<10;i++) {
        app.goTo().groupPage();
        List<GroupData> before = app.group().all();//подсчет количества элементов на странице
        GroupData group = new GroupData().withName("test2");
        app.group().create(group);
        List<GroupData> after = app.group().all();//подсчет количества элементов на странице после мсоздания нового
        assertEquals(after.size(), before.size() + 1);// сама проверка
        //}
        before.add(group);
        group.withId(after.stream().mapToInt(GroupData::getId).max().getAsInt());

        //group.withId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        assertEquals(after, before);

    }

}
