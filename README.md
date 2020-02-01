# metaeffekt-container-annex
Project generating a software distribution annex for a docker container image.

## Instructions to Build

### Prerequisites

- Java JDK 1.8 or later
- Maven 3.3 or later
- Docker (recent version)

### Clone

`git clone https://github.com/org-metaeffekt/metaeffekt-container-annex.git`

### Build

Pull an image if not already available:

`docker pull alpine:latest`

Change directory:

`cd metaeffekt-container-annex`

Build the project using:

`mvn clean install -Dimage.repo=alpine -Dimage.tag=latest`

The `image.repo` and `image.tag` parameters can vary, but should match an available docker image. 
Please note that the project in the current version may not all special cases 
and linux operating systems used in docker containers today.

## Results

### Output 
The project extracts all information available from the container with respect to 
installed packages and additional files and produces a PDF document that lists all
elements of the container with license metadata.

Check out the resulting PDF in:

`documentation/ae-container-annex/target/ae-container-annex-HEAD-SNAPSHOT-en.pdf`

## Disclaimer
The project does not include further meta data from other sources. Some additional
meta data will be supplied in metaeffekt-container-annex/inventory. This is currently for
illustration purposes, only. All metadata in the inventory have been generated using
automated tools. No review and clearing of the meta data was performed.

The current quality level of the data listed in the inventory and annex does not
meet the requirements for operating or distributing the chosen container. The different
containers and linux distributions vary strongly in terms of license meta data included
in the container.

The approach operates on the resulting container image. Individual layers are at the 
moment not considered. It is general consensus that the `Dockerfile`s for constructing the
container image should be subject to a in-depth review in the context of a compliance 
assessment.

## Feedback
We are happy to collect your feedback using [contact@metaeffekt.com](mailto:contact@metaeffekt.com).

## Final Note
The project gives just a glimpse of what is possible with the plugins. We plan to extend the
example to cover these aspects over time. All is generally driven by the idea of integrating
the plugins very close to the software build in a continuous integration environment.
