package io.github.ihaohong.cci;


import io.github.ihaohong.cci.s001.Solution;
import junit.framework.TestCase;

public class Solution001 extends TestCase {
    public void test01() {
        Solution s = new Solution();
        assertEquals(true, s.isUniqueChars("hao"));
        assertEquals(false, s.isUniqueChars("haoo"));
        assertEquals(true, s.isUniqueChars("hong"));
        assertEquals(false, s.isUniqueChars("haohong"));
    }
}
