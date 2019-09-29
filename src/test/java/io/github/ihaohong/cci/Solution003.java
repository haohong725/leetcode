package io.github.ihaohong.cci;


import io.github.ihaohong.cci.s003.Solution;
import junit.framework.TestCase;

public class Solution003 extends TestCase {
    public void test01() {
        Solution s = new Solution();
        assertEquals(true, s.permutation("haohong", "haohong"));
        assertEquals(false, s.permutation("haohong", "haohon"));
        assertEquals(true, s.permutation("honghao", "haohong"));
        assertEquals(false, s.permutation("honghao", "haohong,"));
        assertEquals(true, s.permutation("hon,ghao", "haohong,"));
        assertEquals(true, s.permutation("jsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjs", "jsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjjssjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjs"));
    }
}
