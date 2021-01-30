package com.company.HW1;

public class Main5 {
}
/*
н (неявное) – если преобразование происходит автоматически,
я (явное) – если нужно использовать явное преобразование,
х – если преобразование невозможно,
т  - преобразование к тому же типу.



        Из       в	byte	short	char	int	  long	float	double	boolean
        byte	     Т	     Н	     Я	     Н	    Н	  Н	      Н	      Х
        short	     Я	     T	     Я       Н 	    Н	  Н 	  Н 	  Х
        char	     Я	     Я	     T	     Н	    Н	  Н	      Н	      Х
        int	         Я	     Я	     Я	     T	    Н	  Н	      Н	      Х
        long	     Я	     Я	     Я	     Я	    T	  Н	      Н	      Х
        float	     Я	     Я	     Я	     Я	    Я	  T	      Н	      Х
        double	     Я	     Я	     Я	     Я	    Я	  Я 	  T	      Х
        boolean	     X	     Х	     Х 	     Х	    Х	  Х	      Х	      T
 */