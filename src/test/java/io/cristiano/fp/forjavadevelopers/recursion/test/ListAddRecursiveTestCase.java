package io.cristiano.fp.forjavadevelopers.recursion.test;

import io.cristiano.fp.forjavadevelopers.recursion.ListAddRecursive;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListAddRecursiveTestCase {


    @Test(expected = NullPointerException.class)
    public void should_sum_list_null() {
        ListAddRecursive.call(null);
    }

    @Test
    public void should_sum_list_one_item() {
        List<Integer> numbers = Arrays.asList(10);
        Assert.assertEquals(new Integer(10), ListAddRecursive.call(numbers));
    }

    @Test
    public void should_sum_list_two_items() {
        List<Integer> numbers = Arrays.asList(10, 10);
        Assert.assertEquals(new Integer(20), ListAddRecursive.call(numbers));
    }

    @Test
    public void should_sum_list_three_items() {
        List<Integer> numbers = Arrays.asList(10, 10, 10);
        Assert.assertEquals(new Integer(30), ListAddRecursive.call(numbers));
    }

    @Test
    public void should_sum_list_four_items() {
        List<Integer> numbers = Arrays.asList(10, 10, 10, 25);
        Assert.assertEquals(new Integer(55), ListAddRecursive.call(numbers));
    }

    @Test
    public void should_sum_list_five_items() {
        List<Integer> numbers = Arrays.asList(10, 10, 10, 25, 25);
        Assert.assertEquals(new Integer(80), ListAddRecursive.call(numbers));
    }


    @Test
    public void should_sum_list_six_items() {
        List<Integer> numbers = Arrays.asList(10, 10, 10, 25, 25, 10);
        Assert.assertEquals(new Integer(90), ListAddRecursive.call(numbers));
    }

    @Test
    public void should_sum_list_seven_items() {
        List<Integer> numbers = Arrays.asList(10, 10, 10, 25, 25, 10, 5);
        Assert.assertEquals(new Integer(95), ListAddRecursive.call(numbers));
    }

    @Test
    public void should_sum_list_eight_items() {
        List<Integer> numbers = Arrays.asList(10, 10, 10, 25, 25, 10, 5, 5);
        Assert.assertEquals(new Integer(100), ListAddRecursive.call(numbers));
    }

    @Test
    public void should_sum_list_nine_items() {
        List<Integer> numbers = Arrays.asList(10, 10, 10, 25, 25, 10, 5, 5, 10);
        Assert.assertEquals(new Integer(110), ListAddRecursive.call(numbers));
    }

    @Test
    public void should_sum_list_ten_items() {
        List<Integer> numbers = Arrays.asList(10, 10, 10, 25, 25, 10, 5, 5, 10, 20);
        Assert.assertEquals(new Integer(130), ListAddRecursive.call(numbers));
    }


}
