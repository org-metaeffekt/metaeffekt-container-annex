# metaeffekt-container-annex
Project generating a software distribution annex for a docker container image.

## Instructions to Build

### Prerequisites

- Java JDK 1.8 or later
- Maven 3.3 or later
- Docker (recent version)

### Clone

`git clone https://github.com/org-metaeffekt/metaeffekt-container-annex.git

### Build

`cd metaeffekt-container-annex`

`mvn clean install -Dimage.repo=ubuntu -Dimage.tag=latest`

The `image.repo` and `image.tag` parameters can vary, but should match an available docker image. 
Please note that the project in the current version may not all special cases 
and linux operating systems used in docker containers today.

## Results

### Output 
The project extracts all information available from the container with respect to 
installed packages and additional files and produces a PDF document that lists all
elements of the container with license metadata.

### Disclaimer
The project does not include further meta data from other sources. Some additional
meta data is supplied in metaeffekt-container-annex/inventory. This is currently for
illustration purposes, only. All metadata in the inventory have been generated using
automated tools. No review and clearing of the meta data was performed.

The current quality level of the data listed in the inventory and annex does not
meet the requirements for operating or distributing the chosen container.

## Feedback
We are happy to collect your feedback using [contact@metaeffekt.com](mailto:contact@metaeffekt.com).
