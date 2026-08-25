# Mandatory Development Checklist

Before completing any development change, run all three checks from the repository root:

- [ ] Lint: `git diff --check` (no Maven lint plugin is configured)
- [ ] Build: `cd socops && ./mvnw clean package`
- [ ] Test: `cd socops && ./mvnw test`

# Agent Instructions

- `socops/` is the Java 21 Spring Boot app; `docs/` is a separate static GitHub Pages site. Change `socops/` unless the request targets Pages.
- The app serves `socops/src/main/resources/templates/game.html` at `/` and exposes `GET /api/bingo/fresh-board`.
- Packages are `com.socops.{data,model,service,web}`. Keep `BoardAssembler` pure and static, with immutable record models.
- For local development use `cd socops && ./mvnw spring-boot:run`; the app uses port `8080`. Check `/` and `/api/bingo/fresh-board` after relevant changes.

## Game Rules

- Boards contain 25 cells in a 5x5 layout; cell `12` is always the selected free center cell.
- New boards use 24 distinct prompts from `IcebreakerPrompts.ALL_PROMPTS`.
- Java board logic is mirrored by inline JavaScript in `game.html`; update both when changing rules.
- Keep `socops/src/test/java/com/socops/service/BoardAssemblerTests.java` aligned with board behavior changes.

## Editing

- Prefer the Maven wrapper, Spring Boot, Thymeleaf, records, and existing CSS utilities; avoid new frontend dependencies without clear need.
- Follow `.github/instructions/css-utilities.instructions.md` and `.github/instructions/frontend-design.instructions.md` for UI work.
- Ignore `workshop/` for code suggestions, as requested by `workshop/.ignored-by-agents`.
- Use only custom agents currently present in `.github/agents/`; add focused tests for behavior changes.
- Avoid generated output and unrelated changes. Browser, accessibility, and responsive behavior lack comprehensive automated coverage.

Link to canonical docs instead of duplicating them: [README](README.md), [README em português](README.pt_BR.md), [workshop guide](workshop/GUIDE.md), [setup](workshop/01-setup.md), [frontend design](workshop/02-design.md), [multi-agent lab](workshop/04-multi-agent.md), and [contributing](CONTRIBUTING.md).
