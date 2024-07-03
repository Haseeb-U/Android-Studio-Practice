package com.example.animalswikiapp.Data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.animalswikiapp.R

data class Animal(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)

val AnimalList = listOf(
    Animal(R.string.Fox_name, R.string.Fox_desc, R.drawable.fox),
    Animal(R.string.Eagle_name, R.string.Eagle_desc, R.drawable.eagle),
    Animal(R.string.Owl_name, R.string.Owl_desc, R.drawable.owl),
    Animal(R.string.Lion_name, R.string.Lion_desc, R.drawable.lion),
    Animal(R.string.Tiger_name, R.string.Tiger_desc, R.drawable.tiger),
    Animal(R.string.Elephant_name, R.string.Elephant_desc, R.drawable.elephant),
    Animal(R.string.Giraffe_name, R.string.Giraffe_desc, R.drawable.giraffe),
    Animal(R.string.Zebra_name, R.string.Zebra_desc, R.drawable.zebra),
    Animal(R.string.Gorilla_name, R.string.Gorilla_desc, R.drawable.gorilla),
    Animal(R.string.Chimpanzee_name, R.string.Chimpanzee_desc, R.drawable.chimpanzee),
    Animal(R.string.Leopard_name, R.string.Leopard_desc, R.drawable.leopard),
    Animal(R.string.Cheetah_name, R.string.Cheetah_desc, R.drawable.cheetah),
    Animal(R.string.Rhinoceros_name, R.string.Rhinoceros_desc, R.drawable.rhinoceros),
    Animal(R.string.Hippopotamus_name, R.string.Hippopotamus_desc, R.drawable.hippopotamus),
    Animal(R.string.Crocodile_name, R.string.Crocodile_desc, R.drawable.crocodile),
    Animal(R.string.Alligator_name, R.string.Alligator_desc, R.drawable.alligator),
    Animal(R.string.Penguin_name, R.string.Penguin_desc, R.drawable.penguin),
    Animal(R.string.Koala_name, R.string.Koala_desc, R.drawable.koala),
    Animal(R.string.Panda_name, R.string.Panda_desc, R.drawable.panda),
    Animal(R.string.GrizzlyBear_name, R.string.GrizzlyBear_desc, R.drawable.grizzly_bear),
    Animal(R.string.PolarBear_name, R.string.PolarBear_desc, R.drawable.polar_bear),
    Animal(R.string.Wolf_name, R.string.Wolf_desc, R.drawable.wolf),
    Animal(R.string.Deer_name, R.string.Deer_desc, R.drawable.deer),
    Animal(R.string.Moose_name, R.string.Moose_desc, R.drawable.moose),
    Animal(R.string.Dolphin_name, R.string.Dolphin_desc, R.drawable.dolphin),
    Animal(R.string.Shark_name, R.string.Shark_desc, R.drawable.shark),
    Animal(R.string.Whale_name, R.string.Whale_desc, R.drawable.whale),
    Animal(R.string.SeaTurtle_name, R.string.SeaTurtle_desc, R.drawable.sea_turtle),
    Animal(R.string.Octopus_name, R.string.Octopus_desc, R.drawable.octopus)

    )