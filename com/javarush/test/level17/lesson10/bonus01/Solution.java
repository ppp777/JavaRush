package com.javarush.test.level17.lesson10.bonus01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * JavaRush.ru <br/>
 * Level 17, Lesson 10, Bonus 01
 * <p/>
 * CRUD <br/>
 * CrUD - Create, Update, Delete. <br/>
 * Программа запускается с одним из следующих наборов параметров:
 * <ul>
 *  <li>-c name sex bd</li>
 *  <li>-u id name sex bd</li>
 *  <li>-d id</li>
 *  <li>-i id</li>
 *  </ul>
 * Значения параметров:
 * <ul>
 * <li>name - имя, String</li>
 * <li>sex - пол, "м" или "ж", одна буква</li>
 * <li>bd - дата рождения в следующем формате 15/04/1990</li>
 * <li>-с  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран</li>
 * <li>-u  - обновляет данные человека с данным id</li>
 * <li>-d  - производит логическое удаление человека с id</li>
 * <li>-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)</li>
 * </ul>
 * <p/>
 * id соответствует индексу в списке. <br/>
 * Все люди должны храниться в allPeople. <br/>
 * Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
 * <p/>
 * Пример параметров: -c Миронов м 15/04/1990
 * <p/>
 * Date: 11.08.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static List<Person> allPeople = new ArrayList<Person>();

    static
    {
        allPeople.add( Person.createMale( "Иванов Иван", new Date() ) );  //сегодня родился    id=0
        allPeople.add( Person.createMale( "Петров Петр", new Date() ) );  //сегодня родился    id=1
    }

    public static void main( String[] args )
    {
        //start here - начни тут
    }
}
