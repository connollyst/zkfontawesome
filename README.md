#zkfontawesome
##Introduction
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
    <dependency>
        <groupId>org.zkoss</groupId>
        <artifactId>zkfontawesome</artifactId>
        <version>${zk.fontawesome.version}</version>
    </dependency>
You can find the latest version on
 [mvnrepository.com](http://mvnrepository.com/artifact/org.zkoss/zkfontawesome).

This will include all the CSS and font files you need and gives you access to
 the new ZUML and Java objects.

##Be Awesome
You now have a new ZK component `icon`..
    <icon type="icon-smile"/>

Which should behave much as you expect..
    <zk>
        <vlayout>
            <a href="http://fortawesome.github.io/Font-Awesome/icon/smile/">
                <icon type="icon-smile"/>
            </a>
            <icon type="icon-thumbs-up"
                  onClick="alert('Awesome!')"/>
        <vlayout>
    </zk>

Of course, these icons can be manipulated with CSS..
    <zk>
        <style>
            .github-link {
                color: #000;
            }
            .github-link:hover {
                color: #4183C4;
            }
        </style>
        <a href="http://fortawesome.github.io/Font-Awesome/icon/github/"
           sclass="github-link">
            <icon type="icon-github"/>
        </a>
    </zk>

