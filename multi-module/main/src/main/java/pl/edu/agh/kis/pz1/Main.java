package pl.edu.agh.kis.pz1;

import pl.edu.agh.kis.pz1.util.CryptUtil;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        CardGame game = new CardGame(4, 5);
        game.start();
        game.show();

        System.out.println(CryptUtil.encryptThisString("Agh"));
        System.out.println(CryptUtil.add(10,10));
    }
}
