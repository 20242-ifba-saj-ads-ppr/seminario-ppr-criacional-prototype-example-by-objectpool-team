package tree_nodes_prototype;

class Main {
    public static void main(String[] args) {

        FolderNode root = new FolderNode("root");

        root.addFile(new FileNode("file1", "content1"))
        .addFile(new FileNode("file2", "content2"))
        .addFolder(new FolderNode("folder1")
            .addFile(new FileNode("file3", "content3"))
            .addFile(new FileNode("file4", "content4"))
            .addFolder(new FolderNode("folder2")
                .addFile(new FileNode("file5", "content5"))
                .addFile(new FileNode("file6", "content6"))
            )
        );

        root.toPrintTree(0);

        FolderNode clonedRoot = root.clone();
        
        System.out.println("Pasta clonada:");
        
        root.toPrintTree(0);
        
        
        // OBS: o metodo equals imprime erro caso sejam a mesma instancia,
        // isso prova que é uma copia de dados
        System.out.println("Igualdade: " + root.equals(clonedRoot));
    }
}