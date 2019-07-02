package com.coding;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


/**
 * @Author: zhangyu
 * @Description:
 * @Date: 2019/6/28 11:08
 * @Modify:
 */

@RunWith(Parameterized.class)
public class MemberTest {

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][]{
                {30, 60},
                {20, 40},
                {50, 100},
        });
    }


    private Integer money;
    private Integer points;

    public MemberTest(Integer money, Integer points) {
        this.money = money;
        this.points = points;

    }

    @Test
    public void rechargeTest() {
        Member member = new Member();
        member.recharge(money);
        Assert.assertSame(points, member.getPoints());


    }

    @Test(expected = IllegalArgumentException.class)
    public void checkMoney() {
        Member member = new Member();
        member.recharge(31);

    }
}
