package com.gmail.at.kotamadeo;

import com.gmail.at.kotamadeo.util.Dictionary;

public class Main {
    private static final String TEST_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
            "eiusmod tempor incididunt ut labore et dolore magna aliqua. Aliquet porttitor lacus luctus " +
            "accumsan tortor posuere ac ut consequat. Elit eget gravida cum sociis natoque penatibus. In nisl nisi" +
            " scelerisque eu ultrices vitae auctor. Eget nunc scelerisque viverra mauris in aliquam sem" +
            " fringilla. Aliquam vestibulum morbi blandit cursus risus at. Sagittis id consectetur purus" +
            " ut faucibus pulvinar. Dui id ornare arcu odio ut sem. Morbi tristique senectus et netus" +
            " et malesuada fames ac. Nisl nunc mi ipsum faucibus vitae. Vestibulum morbi blandit cursus" +
            " risus at ultrices mi. Venenatis urna cursus eget nunc scelerisque. Viverra vitae congue" +
            " eu consequat ac felis donec. Amet luctus venenatis lectus magna fringilla urna porttitor" +
            " rhoncus dolor. Interdum consectetur libero id faucibus nisl tincidunt. Ultricies integer" +
            " quis auctor elit sed vulputate mi sit amet. Tellus pellentesque eu tincidunt tortor" +
            " aliquam. Dictumst vestibulum rhoncus est pellentesque elit. Vitae elementum curabitur" +
            " vitae nunc sed velit. Lectus magna fringilla urna porttitor rhoncus dolor purus.";

    public static void main(String[] args) {
        Dictionary.getDictionaryFromText(TEST_TEXT).forEach(System.out::println);
    }
}