from random import shuffle
 
deck = []
for i in range(0, 52):
	deck.append(i)

shuffle(deck)

# Bogo-sort deck in place
counter = 0
while not all(x <= y for x, y in zip(deck, deck[1:])):
    shuffle(deck)
    counter += 1
    if counter % 1000 == 0:
    	print counter

print 'done!'
print counter
