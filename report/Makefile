FILENAME=thesis

ifeq ($(shell uname -s), Linux)
	OPEN_UTIL = gnome-open
else
	OPEN_UTIL = open
endif


	#texcount $(FILENAME).tex -inc -letter -total

all: 
	latexmk -pdf $(FILENAME).tex
	texcount $(FILENAME).tex -inc -total -letters
clean:
	cp $(FILENAME).tex _$(FILENAME).tex
	rm $(FILENAME).*
	mv _$(FILENAME).tex $(FILENAME).tex

open:
	$(OPEN_UTIL) $(FILENAME).pdf
