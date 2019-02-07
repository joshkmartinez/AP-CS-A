                                                    Summer, 2014

This is the README file for the javanotes source download...
                                                    
Directory javanotes8-source contains the source files that are used 
to produce the web site and PDF versions of "Introduction to Programming 
using Java", Eighth Edition.  This free textbook (or a later edition) can 
be found on the web at:  http://math.hws.edu/javanotes8

      Everything in this directory is released under a 
      Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License 
      (see http://creativecommons.org/licenses/by-nc-sa/3.0/).
      You are given permission by the author and copyright holder,
      David J. Eck, to make and distribute copies of this work 
      or modified versions of this work, for non-commercial purposes,
      provided that you include a clear attribution  to the author of 
      the original work and make clear any modifications that you 
      have made.  The attribution should include a reference to the 
      web site, http://math.hws.edu/javanotes8.  ADDITIONALLY, permission
      is given to use Java source code from this work in programming 
      projects [but not in educational material] without restriction 
      and without attribution, for commercial or non-commercial
      purposes.  No claim is made about the suitability or 
      reliability of any of the source code.

The source files for "Introduction to Programming using Java" include
XML files, which contain most of the text; XSLT transformation files,
which are used to translate the XML files into a web site and LaTeX 
files; image files for both the web and PDF versions; Java source 
code files for examples in the textbook; scripts for building the
web site and PDF versions; and other miscellaneous files.  Build
scripts (.sh files) are provided for Linux / Mac OS.  The scripts 
have been tested on at least one machine, but are not guaranteed to 
work for you.

Making any modifications to the source will require a fair amount
of expertise in a variety of technologies.  The source was not 
originally designed for publication and comes with minimal instructions
and help.  It is provided as-is, with no guarantee of usefulness or
usability.

To use the source files, you will need Java (Version 5 or later)
and the Xalan Java XSLT processor (tested with version 2.7.1).  To
build the PDF versions, you will also need the TeX typesetting 
system -- in particular the latex and dvipdf commands.  

For information on getting TeX, see http://www.latex-project.org/ftp.html.
The build scripts for the PDF versions assume that the command
"latex" is available on your system, and also that "dvipdf" is
available.  Alternative command names, or full paths to the commands, can 
be set by editing the script BUILD-env.sh and providing new definitions 
for the appropriate variables.

Xalan can be obtained from http://xml.apache.org/xalan-j/downloads.html
Two versions are available, xalan-j_2_7_1-bin.zip or
xalan-j_2_7_1-bin-2jars.zip ; either one will work.
To make things as easy as possible, you can extract Xalan-J in
the javanotes-6.0-source directory, and rename the directory from 
something like "xalan-j_2_7_1" to "xalan".  Alternatively, you can edit 
the script BUILD-env.sh, and define XALAN_DIR to refer to the correct 
directory name for Xalan. (Or, you could make a symbolic link from "xalan" 
to the Xalan directory.)  Note that you really only need the .jar files 
in the Xalan directory.

The following scripts are provided:

    BUILD-env.sh
          --- defines variables used in other scripts.

    BUILD-web-site.sh 
          --- creates the web site version of the book.
          --- This does NOT require LaTeX.
          
    BUILD-pdf.sh 
          --- creates the regular PDF version of the book,
              (suitable mostly for printing)
              
    BUILD-linked-pdf.sh
          --- creates the linked PDF version of the book,
              (suitable mostly for on-screen reading)
              
    BUILD-lulu.sh
          --- creates the three PDF files for the print versions
              that are published at lulu.com
              
    BUILD-all.sh
          --- runs the scripts to build all versions except lulu, 
              with output turned off.  (Takes a while!)
             
              
All these scripts put their output in a directory named
build_output (but the destination can be changed by
redefining BUILD_OUTPUT_DIR in BUILD-env.sh.)

Note that not all errors are detected by the scripts, so you will
have to check the output directory to make sure that the output
was actually produced correctly, even if the script says that it
finished successfully.
              
Here is a little more information for people who would like
to try producing modified versions of the textbook...

The XML files that define the sections of the various chapters
in the book can be found in one directory per chapter.  The
directories are named c1-overview, c2-basics, c3-control, c4-subroutines,
and so on.  These directories also contain other files, such as
images and .jar files, that are used in each chapter in the
web site version of the book.  The directories also contain
XML files for the chapter quiz and exercises.  The Java source 
code files for the examples in the textbook are in the directory 
named src-c1, src-c2, src-3, and so on.

The syntax of the XML files is defined by the DTD file,
javanotes8.dtd.  This is a fairly simple, home-brewed DTD.
Note that the elements <web>...</web>  and <webdiv>...</webdiv>
defines content that is sent only to the web site version of 
the book, while <tex>...</tex> and <texdiv>...</texdiv> 
define content that goes only to the LaTeX (that is, PDF) 
versions.   Also note that entity names are defined to refer 
to the XML files that define the individual sections of the book.

The file javanotes8.xml is the main xml file that is processed
to create the web site version of the book.  It simply reads in
javanotes8-xml-includes.txt, which in turn reads in all the
individual xml files for the individual sections.  For the
LaTeX/PDF versions, the main xml file is javanotes8-tex.xml.

Xalan is used with the XSLT files convert-web.xsl, convert-tex.xsl,
and convert-tex-linked.xsl to process the XML files.  Note that
the XSLT files use features specific to Xalan-j, so they cannot
be expected to work with other XSLT processors.

Many of the images used in the book were created using the 
program Inkscape on Linux.  The Inkscape sources can
be found in the directory named images-sources-inkscape.
(Inkscape files are SVG files, so you can probably open them
with other programs that understand the SVG graphics format.)
The images were exported in PNG format for use on the web and
in EPS format for use with LaTeX.  The LaTeX images are in
the directory images-tex.  The PNG images are in the individual 
chapter directories in which they are used.  In some cases,
the PNG file is the original, and there is no Inkscape file.
The files used by the PDF versions are EPS files and can be found
in iamges-tex.

You are welcome to write to me for more information, but I can't
promise to help you through all the difficulties of using the
source code.

   --Professor David J. Eck
     Department of Mathematics and Computer Science
     Hobart and William Smith Colleges
     300 Pulteney Street
     Geneva, NY 14456    USA
     Email:  eck@hws.edu
     Web:    http://math.hws.edu/eck
 







