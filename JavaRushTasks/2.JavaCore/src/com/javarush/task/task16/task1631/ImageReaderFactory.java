package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by tab65 on 14.03.2019.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader (ImageTypes im) throws IllegalArgumentException{


            if (im == null) {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
            else if (im.equals(ImageTypes.JPG)) {
                return new JpgReader();
            }
            else if (im.equals(ImageTypes.BMP)){
                return new BmpReader();
            }
            else if(im.equals(ImageTypes.PNG)) {
                return new PngReader();
            }
            else  throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
