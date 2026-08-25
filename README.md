🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

<div align="center">

# 🎉 Soc Ops

### Social Bingo for in-person mixers

Find people who match the prompts. Get **5 in a row**. Break the ice.

[![Lab Guide](https://img.shields.io/badge/📚%20Lab%20Guide-View%20Now-blue?style=for-the-badge)](workshop/GUIDE.md)

</div>

---

## What is Soc Ops?

**Soc Ops** is a web-based Social Bingo game designed to energize in-person events and workshops. Each player gets a unique 5×5 board filled with conversation-starter prompts — find someone who matches each square and mark it off. First to get five in a row wins!

> Built with **Java 21 + Spring Boot**, deployed to **GitHub Pages**, and designed to be hacked in a live lab setting.

---

## ✨ Features

| | |
|---|---|
| 🎲 **Unique boards every time** | 24 randomized prompts per game, never the same twice |
| 🆓 **Free center square** | Classic bingo rules — center is always marked |
| ⚡ **Instant setup** | One command to run locally, auto-deploys on push |
| 🌍 **Multilingual** | Available in English, Português (BR), and Español |
| 🤖 **AI-powered lab** | A hands-on workshop for GitHub Copilot multi-agent development |

---

## 🧪 Lab Guide

This repo doubles as a hands-on lab for exploring **GitHub Copilot agents**. Work through the parts at your own pace:

| Part | Title | What you'll do |
|------|-------|----------------|
| [**00**](workshop/00-overview.md) | Overview & Checklist | Get oriented and check prerequisites |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering | Clone, run, and configure agent context |
| [**02**](workshop/02-design.md) | Design-First Frontend | Redesign the UI with Copilot |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master | Create a custom agent from scratch |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development | Orchestrate multiple agents together |

> 📝 All lab guides are available offline in the [`workshop/`](workshop/) folder.

---

## 🚀 Getting Started

**Prerequisites:** [Java 21 JDK](https://adoptium.net/) · [Apache Maven 3.9+](https://maven.apache.org/) (or use the included wrapper)

```bash
# Run locally
cd socops
./mvnw spring-boot:run
# → Open http://localhost:8080
```

```bash
# Build & test
cd socops
./mvnw clean package
./mvnw test
```

> The app auto-deploys to GitHub Pages on every push to `main`.
