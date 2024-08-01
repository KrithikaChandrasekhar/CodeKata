'echo' command in linux is used to display line of text/string that are passed as an argument.

# Test strategy
We are re-implementing an existing program in C. Our main strategy is to ensure that given same input,
our program must produce same output as reference original.

# Test cases
- When calling 'echo' without an argument, then it must print a new line character.
- When calling echo "foo", then it must print "foo" followed by a new line character.
- When calling echo "Foo bar", then it must print "foo bar" followed by a new line character.
- When calling echo foo bar, then it must print foo bar followed by a new line character.
