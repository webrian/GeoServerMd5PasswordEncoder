Md5 Password Encoder for GeoServer
==================================

A pluggable [MD5](https://en.wikipedia.org/wiki/MD5) password encoder for [GeoServer](http://geoserver.org/display/GEOS/Welcome),
see also the GeoServer documentation about [password encryption](http://docs.geoserver.org/stable/en/user/security/passwd.html).
This password encoder has been tested with GeoServer 2.4.0, but should run in all versions using the new security framework
(version > 2.2).

This work is based on explanations from this thread on the mailing list:
[Point of extention for password encryption?](http://osgeo-org.1560.x6.nabble.com/Point-of-extention-for-password-encryption-td4978637.html#a4978720).

Installation
------------

* Clone the repository
* Open the [NetBeans](https://netbeans.org/) project included in the repository and `Clean and Build (Shift+F11)` it
* Copy the resulting `GeoServerMd5PasswordEncoder.jar` to the `/WEB-INF/lib/` directory in the GeoServer webapp
* Restart GeoServer
* In the `User Group Services` settings there is the new password encoder named `MD5`

