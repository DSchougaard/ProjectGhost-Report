FILENAME=thesis

ifeq ($(shell uname -s), Linux)
	OPEN_UTIL = gnome-open
else
	OPEN_UTIL = open
endif


	#texcount $(FILENAME).tex -inc -letter -total

all: 
	awk 'FNR>1' resources/api/headers.top resources/api/*.csv > resources/api.csv
	latexmk -pdf $(FILENAME).tex
	texcount $(FILENAME).tex -inc -total -letters
clean:
	cp $(FILENAME).tex _$(FILENAME).tex
	rm $(FILENAME).*
	mv _$(FILENAME).tex $(FILENAME).tex

open:
	$(OPEN_UTIL) $(FILENAME).pdf
