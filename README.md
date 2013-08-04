#zkfontawesome
##What's Font Awesome?
ZK wrapper for Font Awesome glyphs.

[Font Awesome](http://fortawesome.github.io/Font-Awesome/icons/) is a project
 which grew out of Twitter's Bootstrap.

In the words of Font Awesome:
> Font Awesome gives you scalable vector icons that can instantly be customized
> — size, color, drop shadow, and anything that can be done with the power of
> CSS.

In a nutshell, Font Awesome is a custom font designed by
 [Dave Gandy](https://twitter.com/davegandy) which replaces letters with icons
 commonly used across the web. Think Wingdings.. but useful. The current version
 of Font Awesome, v3.2.1, contains 361 icons ranging from check marks, to paper
 clips, to an ambulance, to the Facebook logo. The idea is to reduce the
 footprint of your site by replacing lots of images with a single font file as
 well as giving you much more control over the icons using CSS.

The purpose of this ZK add-on, then, is to give you familiar ZK client/server
 control over the Font Awesome icons. Let's get started..

##Get Font Awesome

```xml
<dependency>
    <groupId>org.zkoss</groupId>
    <artifactId>zkfontawesome</artifactId>
    <version>${zk.fontawesome.version}</version>
</dependency>
```

You can find the latest version on
 [mvnrepository.com](http://mvnrepository.com/artifact/org.zkoss/zkfontawesome).

This will include all the CSS and font files you need and gives you access to
 the new ZUL and Java objects.

##Be Font Awesome
You now have a new ZK component `icon`..

```xml
<icon type="icon-smile"/>
```

Which should behave much as you expect..

```xml
<zk>
    <vlayout>
        <a href="http://fortawesome.github.io/Font-Awesome/icon/smile/">
            <icon type="icon-smile"/>
        </a>
        <icon type="icon-thumbs-up" onClick="alert('Awesome!')"/>
    <vlayout>
</zk>
```

Of course, these icons can be manipulated with CSS..

```xml
<zk>
    <style>
        .github-link {
            color: #000;
        }
        .github-link:hover {
            color: #4183C4;
        }
    </style>
    <a sclass="github-link" href="http://fortawesome.github.io/Font-Awesome/icon/github/">
        <icon type="icon-github" style="text-decoration:underline"/>
    </a>
</zk>
```

##Be Even Awesomer
Font Awesome supports a number of ways to modify the icon further..

###Size
Draw an icon larger than normal..

```xml
<icon type="icon-smile" size="large"/> <!-- 33% increase -->
<icon type="icon-smile" size="2x"/>
<icon type="icon-smile" size="3x"/>
<icon type="icon-smile" size="4x"/>
```

###Border
Draws a border around the icon for emphasis..

    <icon type="icon-smile" border="true"/>

###Pull
Pull an icon to the left or right of surrounding text..

```xml
<icon type="icon-quote-left" pull="left"/>
<label value="That's what she said."/>
<icon type="icon-quote-right" pull="right"/>
```

###Muting
An icon can be muted to quickly make it lighter without needing to set a CSS
 color youself..

```xml
<icon type="icon-smile" muted="true"/>
```

##Be Java Awesome
Of course all of this can be done from the Java side also..


```java
Icon quoteIcon = new Icon("icon-quote-left");
quoteIcon.setSize(IconSize.LARGE);
quoteIcon.setPull(IconPull.LEFT);
quoteIcon.setMuted(true);
quoteIcon.setBorder(true);
quoteIcon.setParent(window);
```

Cool huh?