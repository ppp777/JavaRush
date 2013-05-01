package com.javarush.test.level13.lesson11.bonus03;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Bonus 03
 * <p/>
 * 1. Разобраться в том, что тут написано. <b/>
 * 2. Изменить код согласно новой архитектуре и добавить новую логику: <b/>
 * 2.1 Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot. <b/>
 * 2.2 Отредактировать класс Robot учитывая AbstractRobot. <b/>
 * 2.3 Расширить класс BodyPart новой частью тела "грудь". <b/>
 * 2.4 Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).
 * <p/>
 * Date: 01.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Robot amigo = new Robot( "Амиго" );
        Robot enemy = new Robot( "Сгибальщик-02" );

        doMove( amigo, enemy );
        doMove( amigo, enemy );
        doMove( enemy, amigo );
        doMove( amigo, enemy );
        doMove( enemy, amigo );
        doMove( amigo, enemy );
        doMove( enemy, amigo );
        doMove( amigo, enemy );
    }

    public static void doMove( AbstractRobot robotFirst, AbstractRobot robotSecond )
    {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println( String.format( "%s атаковал робота %s, атакована %s, защищена %s",
                                                    robotFirst.getName(), robotSecond.getName(), attacked, defenced ) );
    }
}
