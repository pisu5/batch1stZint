import Stories from "react-insta-stories";

export const Stroy = () => {
  const story = [
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPaG-hKNIgvedxbVF_ap-S4oOkXcNGMhagKQ&s",
    {
      url: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPaG-hKNIgvedxbVF_ap-S4oOkXcNGMhagKQ&s",
      duration: 5000,
      header: {
        heading: "Mohit Karekar",
        subheading: "Posted 30m ago",
        profileImage: "https://picsum.photos/100/100",
      },
    },
    {
      url: "https://example.com/pic2.jpg",
      duration: 5000,
      header: {
        heading: "Mohit Karekar",
        subheading: "Posted 30m ago",
        profileImage: "https://picsum.photos/100/100",
      },
    },
    {
      url: "https://example.com/pic2.jpg",
      duration: 5000,
      header: {
        heading: "Mohit Karekar",
        subheading: "Posted 30m ago",
        profileImage: "https://picsum.photos/100/100",
      },
    },
    {
      url: "https://example.com/pic2.jpg",
      duration: 5000,
      header: {
        heading: "Mohit Karekar",
        subheading: "Posted 30m ago",
        profileImage: "https://picsum.photos/100/100",
      },
    },
  ];
  return (
    <>
      <Stories stories={story} />
    </>
  );
};
