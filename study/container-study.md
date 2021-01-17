# Container License Information

## Overview

DISCLAIMER: the data collected here are just snapshots of the current evaluation (status 02.12.2020).

| Container Image | Number of files not covered by packages | Number of packages  | License Attribution | License Attribution Quality | 
| :---: | :----: | :----: | :---: | :---: |
| alpine:latest | 0 | 14 | package-level; no copyright files | low <sup>[1]</sup>]</sup> |
| archlinux:latest | 0 | 101 | package-level; no copyright files | low <sup>[2]</sup> |
| centos:latest | 48 <sup>[3]</sup> | 172 | package-level; (partial) copyright files | medium <sup>[4]</sup> |
| opensuse/tumbleweed:latest| 186 <sup>[5]</sup> | 98 | package-level; no copyright files | medium <sup>[6]</sup> |
| debian:latest | 20 <sup>[7]</sup> | 91 | copyright files | high <sup>[8]</sup> |
| ubuntu:latest | 28 <sup>[7]</sup> | 89 | copyright files | high <sup>[8]</sup> |

[1]: partial usage of SPDX identifiers; single license per package is not sufficient.

[2]: no SPDX identifiers used. License 'custom'. Unspecific license versions. Unclear license expressions.

[3]: including various file types (.so, binaries, etc)

[4]: mixed use of SPDX and other license identifiers; sometimes too unspecific (BSD, OpenLDAP). Use of license expressions.

[5]: 153 of 186 are certificate .pem files

[6]: Strict usage of SPDX identifiers and license expressions. 

[7]: primarily configuration files

[8]: Packges are described in detail in `copyright` files. Not consolidated to comprehensive license / copyright summary. 
No uniform use of license identifiers. No SPDX use.

## Excluded File Patterns

In the above assessment files matching the following ANT pattern are not included:
* `/var/cache/ldconfig/**/*`
* `/var/log/**/*`
* `/var/lib/rpm/**/*`
* `/var/lib/dpkg/**/*`
* `/var/lib/pacman/**/*`
* `/lib/apk/db/**/*`
* `/sys/**/*`
* `/proc/**/*`
* `/root/.*`
* `/etc/**/*`
* `/usr/lib/locale/locale-archive`
* `**/.lock`
* `**/lock`
* `/.dockerenv`
* `**/*.pem`

## Result

In any case, the extracted license information from containers is incomplete or inaccurate. 

A clear standard should be established how comprehensive licensing and copyright information 
is provided for containers.
