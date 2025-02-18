package tree_nodes_prototype;

class FileNode implements PrototypeInterface<FileNode> {

    private String content = "";
    private String name = "";

    public FileNode(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public FileNode clone() {
        return new FileNode(this.name, this.content);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            System.out.println("Erro, são a mesma instancia");
            return true;
        }
        if (!(obj instanceof FileNode)) {
            return false;
        }
        FileNode fileNode = (FileNode) obj;
        return fileNode.name.equals(this.name) && fileNode.content.equals(this.content);
    }

    public String toString() {
        return this.name;
    }
}