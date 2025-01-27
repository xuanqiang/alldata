<!--HOSTED_DOCS_ONLY
import useBaseUrl from '@docusaurus/useBaseUrl';

export const Logo = (props) => {
  return (
    <div style={{ display: "flex", justifyContent: "center", padding: "20px", height: "190px" }}>
      <img
        alt="DataHub Logo"
        src={useBaseUrl("/img/datahub-logo-color-mark.svg")}
        {...props}
      />
    </div>
  );
};

<Logo />

<!--
HOSTED_DOCS_ONLY-->
<p align="center">
<img alt="DataHub" src="docs/imgs/datahub-logo-color-mark.svg" height="150" />
</p>
<!-- -->

# DataHub: The Metadata Platform for the Modern Data Stack
## Built with ❤️ by <img src="https://datahubproject.io/img/acryl-logo-light-mark.png" width="25"/> [Acryl Data](https://acryldata.io) and <img src="https://datahubproject.io/img/LI-In-Bug.png" width="25"/> [LinkedIn](https://engineering.linkedin.com)
[![Version](https://img.shields.io/github/v/release/datahub-project/datahub?include_prereleases)](https://github.com/datahub-project/datahub/releases/latest)
[![PyPI version](https://badge.fury.io/py/acryl-datahub.svg)](https://badge.fury.io/py/acryl-datahub)
[![build & test](https://github.com/datahub-project/datahub/workflows/build%20&%20test/badge.svg?branch=master&event=push)](https://github.com/datahub-project/datahub/actions?query=workflow%3A%22build+%26+test%22+branch%3Amaster+event%3Apush)
[![Docker Pulls](https://img.shields.io/docker/pulls/linkedin/datahub-gms.svg)](https://hub.docker.com/r/linkedin/datahub-gms)
[![Slack](https://img.shields.io/badge/slack-join_chat-white.svg?logo=slack&style=social)](https://slack.datahubproject.io)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/datahub-project/datahub/blob/master/docs/CONTRIBUTING.md)
[![GitHub commit activity](https://img.shields.io/github/commit-activity/m/datahub-project/datahub)](https://github.com/datahub-project/datahub/pulls?q=is%3Apr)
[![License](https://img.shields.io/github/license/datahub-project/datahub)](https://github.com/datahub-project/datahub/blob/master/LICENSE)
[![YouTube](https://img.shields.io/youtube/channel/subscribers/UC3qFQC5IiwR5fvWEqi_tJ5w?style=social)](https://www.youtube.com/channel/UC3qFQC5IiwR5fvWEqi_tJ5w)
[![Medium](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/datahub-project)
[![Follow](https://img.shields.io/twitter/follow/datahubproject?label=Follow&style=social)](https://twitter.com/datahubproject)
### 🏠 Hosted DataHub Docs (Courtesy of Acryl Data): [datahubproject.io](https://datahubproject.io/docs)

---

[Quickstart](https://datahubproject.io/docs/quickstart) |
[Features](https://datahubproject.io/docs/features) |
[Roadmap](https://feature-requests.datahubproject.io/roadmap) |
[Adoption](#adoption) |
[Demo](https://datahubproject.io/docs/demo) |
[Town Hall](https://datahubproject.io/docs/townhalls)

---
> 📣 DataHub Town Hall is the 4th Thursday at 9am US PT of every month - [add it to your calendar!](https://rsvp.datahubproject.io/)
>
> - Town-hall Zoom link: [zoom.datahubproject.io](https://zoom.datahubproject.io)
> - [Meeting details](docs/townhalls.md) & [past recordings](docs/townhall-history.md)

> ✨ DataHub Community Highlights:
>
> - Read our Monthly Project Updates [here](https://blog.datahubproject.io/tagged/project-updates).
> - Bringing The Power Of The DataHub Real-Time Metadata Graph To Everyone At Acryl Data: [Data Engineering Podcast](https://www.dataengineeringpodcast.com/acryl-data-datahub-metadata-graph-episode-230/)
> - Check out our most-read blog post, [DataHub: Popular Metadata Architectures Explained](https://engineering.linkedin.com/blog/2020/datahub-popular-metadata-architectures-explained) @ LinkedIn Engineering Blog.
> - Join us on [Slack](docs/slack.md)! Ask questions and keep up with the latest announcements.

## Introduction

DataHub is an open-source metadata platform for the modern data stack. Read about the architectures of different metadata systems and why DataHub excels [here](https://engineering.linkedin.com/blog/2020/datahub-popular-metadata-architectures-explained). Also read our
[LinkedIn Engineering blog post](https://engineering.linkedin.com/blog/2019/data-hub), check out our [Strata presentation](https://speakerdeck.com/shirshanka/the-evolution-of-metadata-linkedins-journey-strata-nyc-2019) and watch our [Crunch Conference Talk](https://www.youtube.com/watch?v=OB-O0Y6OYDE). You should also visit [DataHub Architecture](docs/architecture/architecture.md) to get a better understanding of how DataHub is implemented.

## Features & Roadmap

Check out DataHub's [Features](docs/features.md) & [Roadmap](https://feature-requests.datahubproject.io/roadmap).

## Demo and Screenshots

There's a [hosted demo environment](https://datahubproject.io/docs/demo) courtesy of [Acryl Data](https://acryldata.io) where you can explore DataHub without installing it locally

## Quickstart

Please follow the [DataHub Quickstart Guide](https://datahubproject.io/docs/quickstart) to get a copy of DataHub up & running locally using [Docker](https://docker.com). As the guide assumes some basic knowledge of Docker, we'd recommend you to go through the "Hello World" example of [A Docker Tutorial for Beginners](https://docker-curriculum.com) if Docker is completely foreign to you.

## Development

If you're looking to build & modify datahub please take a look at our [Development Guide](https://datahubproject.io/docs/developers).

[![DataHub Demo GIF](docs/imgs/entity.png)](https://datahubproject.io/docs/demo)

## Source Code and Repositories

- [datahub-project/datahub](https://github.com/datahub-project/datahub): This repository contains the complete source code for DataHub's metadata model, metadata services, integration connectors and the web application.
- [acryldata/datahub-actions](https://github.com/acryldata/datahub-actions): DataHub Actions is a framework for responding to changes to your DataHub Metadata Graph in real time.
- [acryldata/datahub-helm](https://github.com/acryldata/datahub-helm): Repository of helm charts for deploying DataHub on a Kubernetes cluster
- [acryldata/meta-world](https://github.com/acryldata/meta-world): A repository to store recipes, custom sources, transformations and other things to make your DataHub experience magical

## Releases

See [Releases](https://github.com/datahub-project/datahub/releases) page for more details. We follow the [SemVer Specification](https://semver.org) when versioning the releases and adopt the [Keep a Changelog convention](https://keepachangelog.com/) for the changelog format.

## 项目官网地址

https://github.com/datahub-project/datahub
