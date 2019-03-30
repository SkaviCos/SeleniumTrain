//package ru.stqa.pft.addressbook.tests;
//
//import junitparams.FileParameters;
//import junitparams.JUnitParamsRunner;
//import junitparams.Parameters;
//import junitparams.mappers.CsvWithHeaderMapper;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import ru.stqa.pft.addressbook.model.GroupData;
//import ru.stqa.pft.addressbook.model.Groups;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//@RunWith(JUnitParamsRunner.class)
//public class GroupTestFromFile extends TestBase {
//
////    @Parameterized.Parameters
////    public static Iterable<Object[]> validGroups() throws IOException {
////        List<Object[]> list = new ArrayList<>();
////        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/groups.csv")));
////        String line = reader.readLine();
////        while(line != null){
////            String[] split = line.split(";");
////            list.add(new Object[](new GroupData().withName(split[0]).withHeader(split[1]).withFooter(split[2])));
////            line = reader.readLine();
////        }
////        return Arrays.asList(new Object[][]{
////
////        });
////    }
////
//
//    @Test
//    @FileParameters(value = "classpath:groups.csv", mapper = CsvWithHeaderMapper.class)
//    public void groupCreationTest(String name, String header, String footer){
//
//        GroupData groupData = new GroupData().withName(name).withHeader(header).withFooter(footer);
//        app.goTo().groupPage();
//        Groups before = app.group().all();//подсчет количества элементов на странице
//        app.group().create(groupData);
//        assertThat(app.group().getGroupCount(), equalTo(before.size() + 1));
//        Groups after = app.group().all();//подсчет количества элементов на странице после мсоздания новог
//        assertThat(after, equalTo(before
//                .withAdded(groupData.withId(after.stream().mapToInt(GroupData::getId).max().getAsInt()))));
//
//    }
//
//
//}
