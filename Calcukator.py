import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
import math
import turtle as t
import random as r
import time
import os
import sys
import re
import requests
import json
import csv
import sqlite3
import datetime
import calendar
import statistics
import itertools
import functools
import collections
import operator
import string

def add(a, b):
    return a + b
def subtract(a, b):
    return a - b
def multiply(a, b):
    return a * b
def divide(a, b):
    if b == 0:
        raise ValueError("Cannot divide by zero")
    return a / b

try:
    num = int(input("Enter an integer: "))
except ValueError:
    print("Invalid input. Please enter a valid integer.")

float_num1 = float(input("Enter first number: "))
float_num2 = float(input("Enter second number: "))
a = float_num1
b = float_num2


print("Addition: ", add(a, b))
print("Subtraction: ", subtract(a, b))
print("Multiplication: ", multiply(a, b))
print("Division: ", divide(a, b))