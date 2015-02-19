# WC
WC, a unix commands, developed in JAVA

##Version 0.4
	
	- Introduced option -L for getting the largest line of a file
	- Introduced option -S for getting the smallest line of a file


```sh
	
	Example:
		one.txt: Hello World
				 How are you?

		Run as : java wc one.txt -L

		Output:	 12 How are you? one.txt

```

```sh
	
	Example:
		one.txt: Hello World
				 How are you?

		Run as : java wc one.txt -S

		Output:	 11 Hello World  one.txt

```

##Version 0.4 Build 101

	- File reading is fixed
	- User can read any file by giving the path
	- Options are working along with the filename
	- Indentation is fixed

##Version 0.4 Build 100

	- File reading is fixed
	- User can read any file by giving the path

##Version 0.4
	
	Options are introduced. For getting number of lines and byte count and number of words,
	you have to enter -w.

```sh
	
	Example:
		one.txt: Hello World
				 How are you?

		Run as : java wc one.txt -w

		Output:	 5 one.txt

```

##Version 0.3
	
	Options are introduced. For getting number of lines and byte count,
	you have to enter -c.

```sh
	
	Example:
		one.txt: Hello World
				 How are you?

		Run as : java wc one.txt -c

		Output:	 24 one.txt

```

##Version 0.2
	
	Options are introduced. For getting only number of lines,
	you have to enter -l.

```sh
	
	Example:
		one.txt: Hello World
				 How are you?

		Run as : java wc one.txt -l

		Output:	 1 one.txt

```

##Version 0.1 Build 100

	1. Multiple spaces fixed

##Version 0.1

WC will take a text file from user and provides,
		- Number of lines on that file
		- Number of words on that file
		- Number of byte of that file

```sh
	
	Example:
		one.txt: Hello World
				 How are you?

		Run as : java wc one.txt

		Output:	 1 5 24 one.txt

```


