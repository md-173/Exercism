"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""

EXPECTED_BAKE_TIME = 40 # In minutes
PREPARATION_TIME = 2 # Prepration time per layer in minutes

def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """

    return EXPECTED_BAKE_TIME - elapsed_bake_time


def preparation_time_in_minutes(number_of_layers):
    """Calculate the prepartion time based on number of layers in lasagne.
    
    :param number_of_layers: int - number of layers in lasagne.
    :return: int - total prepartion time (in minutes) derived from 'PREPARATION_TIME'

    Function that takes the number_of_layers in the lasagne as an argument and            returns how many minutes you would spend making them.
    """

    return number_of_layers * PREPARATION_TIME

#TODO: define the 'elapsed_time_in_minutes()' function below.

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the time that has elapsed so far, in minutes.
    
    :param number_of_layers: int - number of layers in lasagne.
    :param elapsed_bake_time: int - baking time that has elapsed so far, in minutes.
    :return: int - elapsed overall time (in minutes).

    Function returns the total minutes you have been in the kitchen cooking — your        preparation time layering + the time the lasagna has spent baking in the oven.
    """

    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
