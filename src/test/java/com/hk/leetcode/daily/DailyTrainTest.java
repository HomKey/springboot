package com.hk.leetcode.daily;

import com.hk.leetcode.common.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HomKey on 2020/3/4.
 */
public class DailyTrainTest {

    private DailyTrain dailyTrain;

    @Before
    public void before() {
        dailyTrain = new DailyTrain();
    }

    @Test
    public void orangesRotting() throws Exception {
        int[][] data = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        dailyTrain = new DailyTrain();
        int i = dailyTrain.orangesRotting(data);
        System.out.println(i);
    }

    @Test
    public void distributeCandies() throws Exception {
        dailyTrain.distributeCandies(20, 4);
    }

    @Test
    public void findContinuousSequence() throws Exception {
        int[][] continuousSequence = dailyTrain.findContinuousSequence(1);
        System.out.println(continuousSequence);
    }

    @Test
    public void addTwoNumbers() throws Exception {
//        [2,4,3]
//[5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode listNode = dailyTrain.addTwoNumbers(l1, l2);
        System.out.println(listNode.val);
    }

    @Test
    public void lengthOfLongestSubstring() throws Exception {

    }

    @Test
    public void canThreePartsEqualSum() throws Exception {
        int[] A = new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        int[] B = new int[]{10, -10, 10, -10, 10, -10, 10, -10};
        boolean b = dailyTrain.canThreePartsEqualSum(B);
        System.out.println(b);
    }

    @Test
    public void testCompressString() {
        String str1 = "aabcccccaaa";
        String result1 = "a2b1c5a3";
        String str2 = "abbccd";
        String result2 = "abbccd";
        String s1 = dailyTrain.compressString(str1);
        String s2 = dailyTrain.compressString(str2);
        System.out.println(s1);
        System.out.println(s2);
        Assert.assertEquals(result1, s1);
        Assert.assertEquals(result2, s2);
    }

    @Test
    public void testCountCharacters() {
        String[] words1 = new String[]{"cat", "bt", "hat", "tree"};
        String chars1 = "atach";
        int result1 = 6;
        String[] words2 = new String[]{"hello", "world", "leetcode"};
        String chars2 = "welldonehoneyr";
        int result2 = 10;
        int r1 = dailyTrain.countCharacters(words1, chars1);
        Assert.assertEquals(result1, r1);
        int r2 = dailyTrain.countCharacters(words2, chars2);
        Assert.assertEquals(result2, r2);
        String[] words3 = {"pxlqovnbsgvqjzpfeidchzrodnbqfrccfydzjptukscjuatlsrcurepllxzyghhdepitqptlmfkhzxjgswaulxkfydhkilg", "uqklvqnlhdkwryjawkqfajfpbcnhglxlwxlaskxlytr", "jvgkxcdkxrvfahjkvhmfuyjzxtyxrsogbtsjybeaxugqymcr", "rgxditmosplnqvodtis", "jm", "ruqjwejuanjtiizcmbieobesnjnadzqvqumggblzmkxilgfarnxwpcawtkzxlvugibpidvwtikloeziuxqoi", "wxeyzrnbhlhwxecrgejsrawyulynvgtszwqqlihkcvckgcgtgpyqtkuwvjywmhpskaiwmpyarftqhnogxpith", "vdpbykqlihtpvfnqbrcjpggojqbalerohyitktuikbffvfatcnneuvbanjihiaorrjcdthntnrxebfhvshmpodmzhtwnasbm", "wgjstkoaojcesfdrllugmojwdmgeejyiqvshlowtktddattunarnohgvqsoskfmbrami", "ecwqxbawirvnxvsjybbebclaturorlcbpf", "gtjbaigvufrotlwfoqqolnjabnvtbcygtfcytinzpcjbvprdkdjawrcbthmxjrabimhhs", "cvzlbrvppkyxtjxzeglzwoagmpjnfxddbwolxmwdohgtfktgftzzkwpianslkpldyfzubtjczse", "neaw", "mxhmvkajofnmdiiduactlemcvpztscmsnrdhuhquxnnzywsrzxyplgbppiypxwcfbsnyzblaeifo", "krekecabfpufucjhqphjnibaeqdvdpmrfougdwugvoioqangdnxromwlxnfeydaneyazzclscqgdxlhhgnoqmslfflzqv", "klutvchxsceihfmzitgqakytesfjykribjhjzdruuoycjkwaghmmqkfrhkrtawudtjyjwqbyspamlegqjlwlj", "raykfkflqdzrpthdejetwolgciygwaktulkxemkdbbllkjxhnnafsms", "os", "xhchkcetmlprcdmrnalvkvgabxxnomphqpqhnddqhecogspbdebeoshvjgzvmqu", "jqtdysnpskktynxwmsfaabglagnqcllptvuyyqjwrmqaftenusmsahhhqubkwxltpr", "sulmwluiwvlroldpiyecaicwrawzwflokefqkdwmxejaovvpbflfdtviinbvvtlhhhefmgfsqs", "sxyhcckvyl", "vsaacsybcddxvuzkddjmuivsvtjyanpbydmkcwnkmxvsiantgkvkmqjysclsvd", "sxcghypulvmfqfunxj", "pozekufhlooosxpcggbi", "xzaoxzllcixfqbupqozmzrnugj", "j", "tgslwp", "ntrdkixexajlpjgmcbrqimwtqnzfrqjszeiuvrgzclerzmsnagzaxbredvlrmipzflrzusclckmxphc", "ifdflsywdfizpodsehrrifsvejcxarrxmxyjgbbvqyqvywncphzfmnxhybxpdcozfnzablfx", "uluhplzrsaehaqxfnbcmixueedevhirbwqdyztwaxnkogcauymxgcpabxekib", "agtfkinbdccoemxetbryzpluzlpyzicnfopphrxriqm", "pdympxpwvxwcqaxrvbvyqkrresrjgzgxuyfxtkgldtathokdbyfsqfmitmiyagtqgijaiazvsumeyutbbwxqdshquzrehn", "rqe", "sljsvenhhstnnngzqyo", "dezrzpgldeimxfoqajuhjctgvalwkhkjemjaxumxqmifglbizusuqlttxirpbqbuvauwy", "dkwpyezbmkcskoxxcgrxcewknqgdckjxfyzcmzqcbyeucxbqybxoldogtkmdknsrruvnlfqnpfx", "sjeftmjkuperfynbreycwhuoyqybticswblbrrpugzhlrmiedjqufnehevzqwtaebwvdswsz", "lolnfyliloqmhjmhhohdtgfajjfdjqpubslbsrwitbjmrcegdrdjzvonxaefdvdfcbqmaaks", "qhcoaiocjhuzywkirlblajgeapzajqsoa", "sxrmoqxqbtakuqwmrrkljmegbwbeqbywmlyuprwyhljzejbybxoumidpxdrohwdjoqycpxcmivaulnqzneydwqfsvcxgyyseuk", "yrowy", "dohrzkrzdjehpctnjrvhzojullsiucrhphshwxwicyzkvzbqrztic", "rmshnxtbhsdgkiijrmwulocdzjzpgfyimkjdthuzkhoqgkeawgwincubrloknocxwzgqqcxafksxgzh", "aymovnuhptozhkiyowbeguzlkmrwjnujgjbdne", "abc", "vxoigovwmqizmkwbkktqk", "uokwktdempzloaglvvkqstztmwzcmhgxtoua", "bzwjxqueazlzfojrkbqmhtwrvuwsnfcnylurnddpektekca", "qgndjgvzcyajhgmrrnhdywwdbmkhtthwcfiueuxfldanyrmccwcy"};
        String chars3 = "figspbov";
        int result3 = 2;
        int r3 = dailyTrain.countCharacters(words3, chars3);
        Assert.assertEquals(result3, r3);
    }

    @Test
    public void testIsRectangleOverlap() {
        int[] rec1 = new int[]{0, 0, 1, 1};
        int[] rec2 = new int[]{1, 0, 2, 1};
        boolean rectangleOverlap = dailyTrain.isRectangleOverlap(rec1, rec2);
        System.out.println(rectangleOverlap);
    }

    @Test
    public void testMassage() {
        int massage = dailyTrain.massage(new int[]{1, 5, 1, 7, 10, 1, 20});
        System.out.println(massage);

    }
}