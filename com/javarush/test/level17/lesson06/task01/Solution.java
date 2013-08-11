package com.javarush.test.level17.lesson06.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru <br/>
 * Level 17, Lesson 04, Task 05
 * <p/>
 * Заметки для всех. <br/>
 * Класс Note будет использоваться нитями. <br/>
 * Поэтому сделай так, чтобы лист notes находился в общей памяти.
 * <p/>
 * Date: 11.08.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static class Note
    {
        public List<String> notes = new ArrayList<String>();

        public void addNote( int index, String note )
        {
            System.out.println( "Сейчас будет добавлена заметка [" + note + "] На позицию " + index );
            notes.add( index, note );
            System.out.println( "Уже добавлена заметка [" + note + "]" );
        }

        public void removeNote( int index )
        {
            System.out.println( "Сейчас будет удалена заметка с позиции " + index );
            String note = notes.remove( index );
            System.out.println( "Уже удалена заметка [" + note + "] с позиции " + index );
        }
    }
}
