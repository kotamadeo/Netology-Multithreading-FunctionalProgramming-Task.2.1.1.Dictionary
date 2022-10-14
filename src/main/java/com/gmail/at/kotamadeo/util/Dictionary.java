package com.gmail.at.kotamadeo.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Dictionary {
    private static final String SPACE = "\\W";

    public static List<String> getDictionaryFromText(String text) {
        Function<String, List<String>> function = s -> Arrays.stream(s.split(SPACE))
                .map(w -> w.toLowerCase(Locale.ROOT))
                .sorted()
                .distinct().toList();
        return function.apply(text);
    }
}
