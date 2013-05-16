package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.ImageReaderFactory;
import com.javarush.test.level16.lesson13.bonus01.common.ImageReader;
import com.javarush.test.level16.lesson13.bonus01.common.ImageTypes;

/**
 * JavaRush.ru
 * Level 16, Lesson 13, Bonus 01
 * <p/>
 * Factory method pattern.
 * 1. Внимательно посмотри, какие классы у тебя есть.
 * 2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader, которые реализуют интерфейс
 * ImageReader.
 * 3. В отдельном файле в пакете bonus01 создай класс ImageReaderFactory с одним методом:
 * 3.1 подумай, как он должен называться;
 * 3.2 подумай, какие модификаторы должны быть у этого метода;
 * 4. Этот метод должен:
 * 4.1 для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
 * 4.2 если передан неправильный параметр, то выбросить исключение IllegalArgumentException("Неизвестный тип картинки").
 * <p/>
 * Date: 10.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        ImageReader reader = ImageReaderFactory.getReader( ImageTypes.JPG );
    }
}
