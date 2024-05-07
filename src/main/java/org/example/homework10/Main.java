package org.example.homework10;

import org.example.homework10.albumInnerClass.Album;
import org.example.homework10.employeeProcessing.Employee;
import org.example.homework10.splitTheSentence.LambdaClass;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("**Album inner class task**");
        Album album = new Album("Abbey road");
        Album.Song songOne = album.new Song(1, "Yesterday", 3.22);
        Album.Song songTwo = album.new Song(2, "Girl", 3.02);
        Album.Song songThree = album.new Song(3, "Strawberry fields forever", 5.13);
        Album.Song songFour = album.new Song(1, "Yesterday", 3.22);

        Album.SongList songListBeatles = album.new SongList();
        System.out.println("Adding unique song to album. Result: " + songListBeatles.addSong(songOne));
        songListBeatles.addSong(songTwo);
        songListBeatles.addSong(songThree);
        System.out.println("Adding song that already exist in the album. Result: " + songListBeatles.addSong(songFour));
        System.out.println("Find a song by the name: " + songTwo.getSongName() + " " + songListBeatles.findSongByTitle("girl"));
        System.out.println("Find a song by the number: " + songThree.getSongId() + " " + songListBeatles.findSongByTrackNumber(3));
        System.out.println("Find a song number that doesn't exist in the album. Result: " + songListBeatles.findSongByTrackNumber(4));

        System.out.println(("*").repeat(80));

        System.out.println("**Split the sentence - lambda**");
        LambdaClass.splitAndPrint("I will return to Shangri-La");

        System.out.println(("*").repeat(80));

        System.out.println("**Employee Processing with Local Classes and Anonymous Sorting task**");
        Employee e1 = new Employee("Minnie", "Mouse", "2000-11-27");
        Employee e2 = new Employee("Mickie", "Mouse", "2009-01-07");
        Employee e3 = new Employee("Daffy", "Duck", "1999-12-30");
        Employee e4 = new Employee("Daisy", "Duck", "2015-12-01");
        Employee e5 = new Employee("Goofy", "Dog", "1824-05-30");

        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);

        System.out.println("Sorting by years");
        printOrderedList(list, "year");
        System.out.println("Sorting by names");
        printOrderedList(list, "name");

    }

    public static void printOrderedList(List<Employee> list, String orderBy) {
        class EmployeeData {
            final String fullName;
            final int years;
            final Employee containedEmployee;

            public EmployeeData(Employee containedEmployee) {
                this.fullName = containedEmployee.fullName();
                this.years = containedEmployee.yearsOfWork();
                this.containedEmployee = containedEmployee;
            }

            @Override
            public String toString() {
                return "Calculated Employee Data{" +
                        "fullName: '" + fullName + '\'' +
                        ", worked years = " + years +
                        '}' + "\n";
            }

            public static EmployeeData calculated(Employee employee) {
                return new EmployeeData(employee);
            }
        }

        List<EmployeeData> employeeDataList = new ArrayList<>();

        for (Employee employee : list) {
            employeeDataList.add(EmployeeData.calculated(employee));
        }

        if (orderBy.equalsIgnoreCase("year")) {
            employeeDataList.sort(new Comparator<EmployeeData>() {
                @Override
                public int compare(EmployeeData data1, EmployeeData data2) {
                    return Integer.compare(data1.years, data2.years);
                }
            });

        } else if (orderBy.equalsIgnoreCase("name")) {
            employeeDataList.sort(new Comparator<EmployeeData>() {
                @Override
                public int compare(EmployeeData data1, EmployeeData data2) {
                    return data1.fullName.compareTo(data2.fullName);
                }
            });
        }
        employeeDataList.forEach(System.out::println);

    }
}