FILENAME=agreement
all: 
	latexmk -pdf $(FILENAME).tex
	texcount $(FILENAME).tex -inc -letter -total

clean:
	cp $(FILENAME).tex _$(FILENAME).tex
	rm $(FILENAME).*
	mv _$(FILENAME).tex $(FILENAME).tex

open:
	gnome-open $(FILENAME).pdf
