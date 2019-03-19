package ru.stqa.pft.addressbook.tests;

import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        //for(int i =0;i<10;i++) {
        app.goTo().groupPage();
        Groups before = app.group().all();//подсчет количества элементов на странице
        GroupData group = new GroupData().withName("test2");
        app.group().create(group);
        Groups after = app.group().all();//подсчет количества элементов на странице после мсоздания нового
        assertEquals(after.size(), before.size() + 1);// сама проверка
        //}
        group.withId(after.stream().mapToInt(GroupData::getId).max().getAsInt());
        before.add(group);

        assertThat(after, equalTo(before
                .withAdded(group.withId(after.stream().mapToInt(GroupData::getId).max().getAsInt()))));
    }

}
