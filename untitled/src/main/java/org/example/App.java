package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        CardGame game = new CardGame(4, 5);
        game.start();
        game.show();

        System.out.println(org.example2.CryptUtil.encryptThisString("Agh"));
    }
}
