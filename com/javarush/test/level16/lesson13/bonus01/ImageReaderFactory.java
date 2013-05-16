package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;


public class ImageReaderFactory
{
    static ImageReader getReader( ImageTypes imgType )
    {
        ImageReader imgReader;

        if ( imgType == ImageTypes.BMP )
        {
            imgReader = new BmpReader();
        }
        else if ( imgType == ImageTypes.JPG )
        {
            imgReader = new JpgReader();
        }
        else if ( imgType == ImageTypes.PNG )
        {
            imgReader = new PngReader();
        }
        else
        {
            throw new IllegalArgumentException( "Неизвестный тип картинки" );
        }

        return imgReader;
    }
}
