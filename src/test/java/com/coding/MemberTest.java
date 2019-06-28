package com.coding;

import org.junit.Assert;
import org.junit.Test;


/**
 * @Author: zhangyu
 * @Description:
 * @Date: 2019/6/28 11:08
 * @Modify:
 */
public class MemberTest {
    @Test
    public void points_should_be_60_when_recharge_30() {
        Member member = new Member();
        member.recharge(30);
        Assert.assertSame(60, member.getPoints());

    }
}
