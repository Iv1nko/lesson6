package com.example.affirmations.Data;

import static java.util.List.*;

import com.example.affirmations.R;
import com.example.affirmations.module.Affirmation;

import java.util.List;

public class DataSource {
    public static List<Affirmation> loadAffirmations() {
        return List.of(
                new Affirmation(R.string.affirmation1),
                new Affirmation(R.string.affirmation2),
                new Affirmation(R.string.affirmation3),
                new Affirmation(R.string.affirmation4),
                new Affirmation(R.string.affirmation5),
                new Affirmation(R.string.affirmation6),
                new Affirmation(R.string.affirmation7),
                new Affirmation(R.string.affirmation8),
                new Affirmation(R.string.affirmation9),
                new Affirmation(R.string.affirmation10)
    );
    }
}
