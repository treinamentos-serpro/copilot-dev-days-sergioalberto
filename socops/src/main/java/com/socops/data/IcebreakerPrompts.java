package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "ESPAÇO LIVRE";

    public static final List<String> ALL_PROMPTS = List.of(
            "já montou um computador",
            "usa atalhos de teclado todos os dias",
            "tem um aplicativo favorito de produtividade",
            "já criou um site ou aplicativo",
            "prefere tema escuro",
            "já participou de um hackathon",
            "tem um teclado mecânico",
            "já consertou um problema seguindo um tutorial",
            "usa inteligência artificial no trabalho ou nos estudos",
            "já fez um curso de programação",
            "tem mais de três abas abertas agora",
            "já jogou um jogo indie",
            "sabe explicar o que é código aberto",
            "já perdeu um arquivo por não fazer backup",
            "usa autenticação em dois fatores",
            "já trabalhou ou estudou remotamente",
            "tem um gadget que não vive sem",
            "já automatizou uma tarefa repetitiva",
            "prefere teclado a mouse",
            "já aprendeu uma tecnologia por conta própria",
            "tem um projeto pessoal de tecnologia",
            "já encontrou um bug difícil de explicar",
            "sabe o que é um easter egg digital",
            "já ensinou alguém a usar uma ferramenta digital"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
