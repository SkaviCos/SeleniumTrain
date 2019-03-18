package ru.stqa.pft.addressbook.tests;

import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        //for(int i =0;i<10;i++) {
        app.goTo().groupPage();
        Set<GroupData> before = app.group().all();//подсчет количества элементов на странице
        GroupData group = new GroupData().withName("test2");
        app.group().create(group);
        Set<GroupData> after = app.group().all();//подсчет количества элементов на странице после мсоздания нового
        assertEquals(after.size(), before.size() + 1);// сама проверка
        //}
        group.withId(after.stream().mapToInt((g)->g.getId()).max().getAsInt());
        before.add(group);
        //group.withId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    }

}
