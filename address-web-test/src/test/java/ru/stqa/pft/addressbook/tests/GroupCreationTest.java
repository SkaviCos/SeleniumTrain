package ru.stqa.pft.addressbook.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.io.IOException;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GroupCreationTest extends TestBase {

    private String name;
    private String header;
    private String footer;

    public GroupCreationTest(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }


    @Parameters
    public static Iterable<Object[]> validGroups() throws IOException {
        return Arrays.asList(new Object[][]{

                {"test1", "test1", "test1"},
                {"test12", "test12", "test13"},
                {"test13", "test13", "test12"}
        });
    }

    @Test
    public void testGroupCreation() {
//        Object groupData;
        GroupData groupData = new GroupData().withName(name).withHeader(header).withFooter(footer);
        app.goTo().groupPage();
        Groups before = app.group().all();//подсчет количества элементов на странице
        app.group().create(groupData);
        assertThat(app.group().getGroupCount(), equalTo(before.size() + 1));
        Groups after = app.group().all();//подсчет количества элементов на странице после мсоздания новог
        assertThat(after, equalTo(before
                .withAdded(groupData.withId(after.stream().mapToInt(GroupData::getId).max().getAsInt()))));
    }

    @Test
    public void testBadGroupCreation() {

        app.goTo().groupPage();
        Groups before = app.group().all();//подсчет количества элементов на странице
        GroupData group = new GroupData().withName("test'");
        app.group().create(group);
        assertThat(app.group().getGroupCount(), equalTo(before.size()));
        Groups after = app.group().all();//подсчет количества элементов на странице после мсоздания нового
        assertThat(after, equalTo(before));
    }


}
