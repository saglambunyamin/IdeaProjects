package day42_Exceptions;

import day39_Recap.ShapeTask.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {

        throw new NoSuchElementException("There is no such element as break.");

        // throw new InterruptedException(); --> We can not use throw for the unchecked exceptions

        // throw new Rectangle(20,15); --> This is not an exception

    }
}
