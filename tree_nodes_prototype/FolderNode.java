package tree_nodes_prototype;

import java.util.ArrayList;
import java.util.List;

public class FolderNode implements PrototypeInterface<FolderNode> {

    private List<FolderNode> folderChildren = new ArrayList<>();
    private List<FileNode> fileChildren = new ArrayList<>();

    private String name = "";

    public FolderNode(String name) {
        this.name = name;
        this.folderChildren = new ArrayList<>();
        this.fileChildren = new ArrayList<>();
    }

    public void setFileChildren(List<FileNode> fileChildren) {
        this.fileChildren = fileChildren;
    }

    public void setFolderChildren(List<FolderNode> folderChildren) {
        this.folderChildren = folderChildren;
    }

    public FolderNode addFolder(FolderNode folder) {
        this.folderChildren.add(folder);
        return this;
    }
    public FolderNode addFile(FileNode file) {
        this.fileChildren.add(file);
        return this;
    }

    @Override
    public FolderNode clone(){
        FolderNode clonedFolderNode = new FolderNode(this.name);
        
        List<FolderNode> clonedsFolderChildren = new ArrayList<>();
        for (FolderNode folderChild : this.folderChildren) {
            clonedsFolderChildren.add(folderChild.clone());
        }
        clonedFolderNode.setFolderChildren(clonedsFolderChildren);
        

        List<FileNode> clonedsFileChildren = new ArrayList<>();
        for (FileNode fileChild : this.fileChildren) {
            clonedsFileChildren.add(fileChild.clone());
        }
        clonedFolderNode.setFileChildren(clonedsFileChildren);

        return clonedFolderNode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            System.out.println("Erro, são a mesma instancia");
            return true;
        }
        if (!(obj instanceof FolderNode)) {
            return false;
        }
        FolderNode folderNode = (FolderNode) obj;
        
        return folderNode.name.equals(this.name) && folderNode.folderChildren.equals(this.folderChildren) && folderNode.fileChildren.equals(this.fileChildren);
    }


    public void toPrintTree(int level) {



        String space = "";
        for (int i = 0; i < level; i++) {
            space += "  ";
        }

        System.out.println(space + this.name);

        space += "  ";

        for (FileNode fileChild : this.fileChildren) {
            System.out.println(space + fileChild.toString());
        }

        for (FolderNode folderChild : this.folderChildren) {
            folderChild.toPrintTree(level + 1);
        }
    }
}
