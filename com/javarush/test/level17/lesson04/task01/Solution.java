package com.javarush.test.level17.lesson04.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaRush.ru
 * Level 17, Lesson 04, Task 01
 * <p/>
 * Синхронизированные заметки <br/>
 * 1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы обращения к листу notes блокировали мютекс
 * notes, не this <br/>
 * 2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в блоке
 * synchronized <br/>
 * <p/>
 * Date: 10.08.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static class Note
    {

        public final List<String> notes = new ArrayList<String>();

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
