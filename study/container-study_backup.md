# Container License Information

## Overview

DISCLAIMER: the data collected here are just snapshots of the current evaluation (status 02.02.2020).

| Container Image | Number of files not covered by packages | Number of packages  | License Attribution | License Attribution Quality | 
| :---: | :----: | :----: | :---: | :---: |
| alpine:latest | 0 | 14 | package-level; no copyright files | low (1) |
| archlinux:latest | 0 | 101 | package-level; no copyright files | low (2) |
| centos:latest | 48 (3) | 172 | package-level; (partial) copyright files | medium (4) |
| opensuse/tumbleweed:latest| 186 (5) | 98 | package-level; no copyright files | medium (6) |
| debian:latest | 20 (7) | 91 | copyright files | high (8) |
| ubuntu:latest | 28 (7) | 89 | copyright files | high (8) |

(1) partial usage of SPDX identifiers; single license per package is not sufficient.

(2) no SPDX identifiers used. License 'custom'. Unspecific license versions. Unclear license expressions.

(3) including various file types (.so, binaries, etc)

(4) mixed use of SPDX and other license identifiers; sometimes too unspecific (BSD, OpenLDAP). Use of license expressions.

(5) 153 of 186 are certificate .pem files

(6) Strict usage of SPDX identifiers and license expressions. 

(7) primarily configuration files

(8) Not consolidated to comprehensive license / copyright summary.

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

## Result

In any case, the extracted license information from containers is incomplete or inaccurate. 

A clear standard
should be established how compehensive licensing and copyright information is provided for containers.
